package com.sumin.factorialtest

import android.text.BoringLayout

sealed class State

class Error():State()
class Progress():State()

class Result(val factorial: String):State()