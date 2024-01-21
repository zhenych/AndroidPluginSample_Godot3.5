extends Node2D

var sqlite
var tts

func _ready():
#	sqlite = Engine.get_singleton("GodotSQLite")
#	sqlite.connect("testSignal", self, "_on_testSignal")
	print("singlton SQLite pass")
	
#	if Engine.has_singleton("GodotTTS"):
	tts = Engine.get_singleton("GodotTTS")
	tts.connect("start", self, "_on_tts_start")
	tts.setLanguage("en","US")
	print("singlton TTS pass")

# Called every frame. 'delta' is the elapsed time since the previous frame.
#func _process(delta):
#	pass

func _on_testSignal(data):
	print(data)

func _on_tts_start():
	pass
