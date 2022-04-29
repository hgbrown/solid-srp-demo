package dev.hbrown

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RadarTest {

    private val cut: Radar = Radar(0, 0)

    @Test
    internal fun `should be able to get latitude first result`() {
        val aircraftInRange = cut.findAircraftInRange(6, testAircraftTargets(), true)

        assertEquals("[1 2] [6 -3] [3 4]", aircraftInRange)
    }

    @Test
    internal fun `should be able to get longitude first result`() {
        val aircraftInRange = cut.findAircraftInRange(6, testAircraftTargets(), false)

        assertEquals("[2 1] [-3 6] [4 3]", aircraftInRange)
    }

    private fun testAircraftTargets(): List<AircraftTarget> = listOf(
        AircraftTarget("a1", 1, 2),
        AircraftTarget("a2", 10, 3),
        AircraftTarget("a3", -2, 7),
        AircraftTarget("a4", 6, -3),
        AircraftTarget("a5", 3, 4),
        AircraftTarget("a6", 9, 10),
    )
}
