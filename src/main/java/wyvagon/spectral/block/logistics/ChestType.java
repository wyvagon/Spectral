package wyvagon.spectral.block.logistics;

import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum ChestType implements IStringSerializable {
	ACTIVE_PROVIDER,
	BUFFER,
	PASSIVE_PROVIDER,
	REQUESTER,
	STORAGE;

	@Override
	public String getName() {
		return name().toLowerCase(Locale.ENGLISH);
	}

}