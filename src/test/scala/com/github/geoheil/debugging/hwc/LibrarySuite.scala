/*
 * This Scala Testsuite was generated by the Gradle 'init' task.
 */
package com.github.geoheil.debugging.hwc

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LibrarySuite extends AnyFunSuite {
  test("someLibraryMethod is always true") {
    def library = new Library()
    assert(library.someLibraryMethod)
  }
}
