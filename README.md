# Refactoring to SOLID: Single Responsibility Principle (SRP) Demo

This demo models a simple Radar system. The system attempts to find aircraft that are within a given range to itself. This can be used (for example) by airports to find aircraft that are close to the airport and need to be managed by that airport.

In the **main** branch we have an implementation of the `Radar.findAircraftInRange` that violates the SRP.
The method has 2 responsibilities: it (1) finds the aircraft in range and (2) is responsible for formatting the output using the `latFirst` parameter to allow the caller to control how the output should be formatted.

The **refactored** branch demonstrates how this method can be refactored to give the responsibility for formatting the output to another dedicated component without sacrificing the ability of the caller to control the output when calling the method.
