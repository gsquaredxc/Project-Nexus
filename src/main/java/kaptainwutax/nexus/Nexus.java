package kaptainwutax.nexus;

import org.lwjgl.system.*;

import kaptainwutax.nexus.path.Pathfinding;
import kaptainwutax.nexus.utility.Time;
import kaptainwutax.nexus.gpu.Compute;
import net.fabricmc.api.ClientModInitializer;

public class Nexus implements ClientModInitializer {

	private static Nexus INSTANCE = new Nexus();

	public static Nexus getInstance() {
		return INSTANCE;
	}

	@Override
	public void onInitializeClient() {
		System.out.println("[Project-Nexus] Hello world!");
        Compute clApp = new Compute();
        clApp.run();
	}

	public void tick() {
		Time.updateTime();
		Pathfinding.tick();
	}

}
