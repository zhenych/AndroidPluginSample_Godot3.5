extends Node2D

var helloWorld

func _ready():
	helloWorld = Engine.get_singleton("GodotSQLite")
	helloWorld.connect("testSignal", self, "on_testSignal")

# Called every frame. 'delta' is the elapsed time since the previous frame.
#func _process(delta):
#	pass

func on_testSignal(data):
	print(data)
