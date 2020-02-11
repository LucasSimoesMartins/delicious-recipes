package com.lucassimoesmartins.deliciousrecipes.model

data class WinePairing(
    val pairedWines: List<String>,
    val pairingText: String,
    val productMatches: List<ProductMatch>
)