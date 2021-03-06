package com.km.snow.managed

trait ManagedIndexConfiguration {
  def bufferSize: Int
  def flushEvery: Long
}

class DefaultManagedIndexConfiguration extends ManagedIndexConfiguration {
  def bufferSize = 10000 // docs
  def flushEvery = 10000 // millis
}