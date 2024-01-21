package sizov.godot.plugin.android.godotsqlite;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;
import org.godotengine.godot.plugin.UsedByGodot;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class GodotSQLite extends GodotPlugin {
    public GodotSQLite(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GodotSQLite";
    }

//    @NonNull
//    @Override
//    public List<String> getPluginMethods() {
//        return Arrays.asList(
//                "getHello", "getHelloSignal"
//        );
//    }

    @NonNull
    @Override
    public Set<SignalInfo> getPluginSignals() {
        Set<SignalInfo> signals = new androidx.collection.ArraySet<>();

        signals.add(new SignalInfo( "testSignal", String.class));

        return signals;
    }

    @UsedByGodot
    public String getHello() {
        return "Hello World";
    }

    @UsedByGodot
    public void getHelloSignal(String s) {
        emitSignal( "testSignal", s);
    }
}
