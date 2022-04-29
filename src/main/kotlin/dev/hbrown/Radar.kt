package dev.hbrown

import kotlin.math.sqrt

/**
 * Represents the radar, specifically the static position of the radar.
 * @property radarLongitude the longitude co-ordinate of the radar.
 * @property radarLatitude the latitude co-ordinate of the radar
 * @constructor Creates a new radar at the specified longitude and latitude position.
 */
class Radar(private val radarLatitude: Int, private val radarLongitude: Int) {

    /**
     * Find the aircraft in a given range of the radar.
     *
     * @param range the range within which to detect aircraft.
     * @param allAircraftDetected all the aircraft detected by the radar.
     * @param formatter used to format the output.
     * @return a string of the co-ordinates of the aircraft within the given range.
     */
    fun findAircraftInRange(range: Int, allAircraftDetected: List<AircraftTarget>, formatter: CoordinateOutputFormatter): String {

        val aircraftInRange = allAircraftDetected.filter { aircraft ->
            val distance = sqrt( (
                    (radarLatitude - aircraft.latitude) * (radarLatitude - aircraft.latitude) +
                            (radarLongitude - aircraft.longitude) * (radarLongitude - aircraft.longitude)
                    ).toDouble() ).toInt()
            distance <= range
        }

        return formatter.format(aircraftInRange)
    }
}
