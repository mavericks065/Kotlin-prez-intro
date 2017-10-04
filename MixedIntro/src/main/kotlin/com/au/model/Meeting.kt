package com.au.model

import java.time.Duration
import java.time.Instant

class Meeting(var date: Instant, var duration: Duration, var room: String, var participants: List<Employee>) {
}