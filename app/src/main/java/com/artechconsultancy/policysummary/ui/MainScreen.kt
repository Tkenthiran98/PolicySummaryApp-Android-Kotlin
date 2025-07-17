package com.artechconsultancy.policysummary.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.artechconsultancy.policysummary.ui.components.BottomNavigationBar
import com.artechconsultancy.policysummary.ui.components.CustomHeader
import com.artechconsultancy.policysummary.ui.screens.*
import com.artechconsultancy.policysummary.ui.theme.LightGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: "policies"

    val titles = mapOf(
        "home" to "Home",
        "policies" to "My Policies",
        "claims" to "Claims",
        "profile" to "Profile"
    )

    Scaffold(
        topBar = {
            CustomHeader(title = titles[currentRoute] ?: "Policy Summary")
        },
        bottomBar = {
            BottomNavigationBar(
                currentRoute = currentRoute,
                onNavigate = { route ->
                    navController.navigate(route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                }
            )
        },
        containerColor = LightGray
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "policies",
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable("home") { HomeScreen() }
            composable("policies") { PoliciesScreen() }
            composable("claims") { ClaimsScreen() }
            composable("profile") { ProfileScreen() }
        }
    }
}