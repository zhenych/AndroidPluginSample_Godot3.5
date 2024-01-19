package sizov.godot.plugin.android.godotsqlite;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

class GodotSQLite extends GodotPlugin {
    public GodotSQLite(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "Godot SQLite";
    }

    @NonNull
    @Override
    public List<String> getPluginMethods() {
        return Arrays.asList("getHello", "getHelloSignall");
    }

    @NonNull
    @Override
    public Set<SignalInfo> getPluginSignals() {
        Set<SignalInfo> signals = null;
        signals = new androidx.collection.ArraySet<>();
        signals.add(new SignalInfo( "testSignal", String.class));
        return signals;
    }

    public String getHello() {
        return "Hello World";
    }

    public void getHelloSignall(String s) {
        emitSignal( "testSignal", s);
    }
}
