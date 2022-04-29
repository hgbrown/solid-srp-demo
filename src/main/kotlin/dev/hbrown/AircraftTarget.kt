package dev.hbrown

/**
 * Represents a single aircraft detected by the Radar.
 * @param id a unique identifier for the aircraft.
 * @param latitude the latitude co-ordinate of the aircraft.
 * @param longitude the longitude co-ordinate of the aircraft.
 */
data class AircraftTarget(
    val id: String,
    val latitude: Int,
    val longitude: Int,
)
