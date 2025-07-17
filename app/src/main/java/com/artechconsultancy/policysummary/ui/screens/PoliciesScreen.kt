package com.artechconsultancy.policysummary.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.artechconsultancy.policysummary.ui.components.PolicyCard
import com.artechconsultancy.policysummary.viewmodel.PolicyViewModel

@Composable
fun PoliciesScreen(viewModel: PolicyViewModel = viewModel()) {
    val policies by viewModel.policies.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {
        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(policies) { policy ->
                    PolicyCard(policy = policy)
                }
            }
        }
    }
}