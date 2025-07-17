package com.artechconsultancy.policysummary.data

object PolicyRepository {
    fun getPolicies(): List<Policy> {
        return listOf(
            Policy(
                id = "1",
                policyName = "Life Insurance Premium",
                policyNumber = "LI001234567",
                policyStatus = PolicyStatus.ACTIVE,
                nextPremiumDue = "25 July 2025",
                startDate = "15 Jan 2020",
                maturityDate = "15 Jan 2040",
                sumAssured = "₹10,00,000",
                premiumFrequency = "Monthly",
                lastPremiumPaid = "25 June 2025",
                nextPremiumAmount = "₹2,500"
            ),
            Policy(
                id = "2",
                policyName = "Health Insurance Plus",
                policyNumber = "HI002345678",
                policyStatus = PolicyStatus.ACTIVE,
                nextPremiumDue = "30 July 2025",
                startDate = "10 March 2022",
                maturityDate = "10 March 2027",
                sumAssured = "₹5,00,000",
                premiumFrequency = "Annual",
                lastPremiumPaid = "30 June 2024",
                nextPremiumAmount = "₹15,000"
            ),
            Policy(
                id = "3",
                policyName = "Car Insurance Standard",
                policyNumber = "CI003456789",
                policyStatus = PolicyStatus.LAPSED,
                nextPremiumDue = "15 July 2025",
                startDate = "20 Feb 2023",
                maturityDate = "20 Feb 2024",
                sumAssured = "₹8,00,000",
                premiumFrequency = "Annual",
                lastPremiumPaid = "20 Feb 2024",
                nextPremiumAmount = "₹12,000"
            )
        )
    }
}