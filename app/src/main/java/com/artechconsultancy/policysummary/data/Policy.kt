package com.artechconsultancy.policysummary.data
data class Policy(
    val id: String,
    val policyName: String,
    val policyNumber: String,
    val policyStatus: PolicyStatus,
    val nextPremiumDue: String,
    val startDate: String,
    val maturityDate: String,
    val sumAssured: String,
    val premiumFrequency: String,
    val lastPremiumPaid: String,
    val nextPremiumAmount: String
)

enum class PolicyStatus {
    ACTIVE,
    LAPSED
}