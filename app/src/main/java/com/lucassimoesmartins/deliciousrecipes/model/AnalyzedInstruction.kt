package com.lucassimoesmartins.deliciousrecipes.model

data class AnalyzedInstruction(
    val name: String,
    val steps: List<Step>
)