package com.artechconsultancy.policysummary.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.artechconsultancy.policysummary.data.Policy
import com.artechconsultancy.policysummary.data.PolicyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PolicyViewModel : ViewModel() {
    private val _policies = MutableStateFlow<List<Policy>>(emptyList())
    val policies: StateFlow<List<Policy>> = _policies.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    init {
        loadPolicies()
    }

    private fun loadPolicies() {
        viewModelScope.launch {
            _isLoading.value = true
            _policies.value = PolicyRepository.getPolicies()
            _isLoading.value = false
        }
    }
}