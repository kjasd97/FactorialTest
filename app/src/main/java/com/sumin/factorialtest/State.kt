package com.sumin.factorialtest

sealed class State

class Error():State()
class Progress():State()

class Factorial(val value: String):State()