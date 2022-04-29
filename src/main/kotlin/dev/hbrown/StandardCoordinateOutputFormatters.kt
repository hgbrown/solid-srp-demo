package dev.hbrown

enum class StandardCoordinateOutputFormatters : CoordinateOutputFormatter {

    LATITUDE_FIRST {
        override fun format(aircraftTargets: List<AircraftTarget>): String =
            aircraftTargets.joinToString(separator = " ") { "[${it.latitude} ${it.longitude}]" }
    },

    LONGITUDE_FIRST {
        override fun format(aircraftTargets: List<AircraftTarget>): String =
            aircraftTargets.joinToString(separator = " ") { "[${it.longitude} ${it.latitude}]" }
    },

}
