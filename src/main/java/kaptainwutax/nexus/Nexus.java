package kaptainwutax.nexus;

import kaptainwutax.nexus.path.Pathfinding;
import kaptainwutax.nexus.utility.Time;
import kaptainwutax.nexus.*;
import net.fabricmc.api.ClientModInitializer;

public class Nexus implements ClientModInitializer {

	private static Nexus INSTANCE = new Nexus();

	public static Nexus getInstance() {
		return INSTANCE;
	}

	@Override
	public void onInitializeClient() {
		System.out.println("[Project-Nexus] Hello world!");
        new gpu.Compute();
	}

	public void tick() {
		Time.updateTime();
		Pathfinding.tick();
	}

}
