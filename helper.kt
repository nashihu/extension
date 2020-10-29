// please create one extension function of Activity class of android

fun Activity.showToast(message: String) {
  Toast.make(this, message, Toast.LENGTH_LONG).show()
}
