package vazkii.zetaimplforge.event.client;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import vazkii.zeta.event.bus.FiredAs;
import vazkii.zeta.client.event.ZKeyMapping;

@FiredAs(ZKeyMapping.class)
public record ForgeZKeyMapping(RegisterKeyMappingsEvent e) implements ZKeyMapping {
	@Override
	public KeyMapping register(KeyMapping key) {
		e.register(key);
		return key;
	}
}
