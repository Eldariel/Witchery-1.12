package net.eldariel.witchery;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;

@Mod(modid=Witchery.MOD_ID, name=Witchery.MOD_NAME, version=Witchery.VERSION, dependencies=Witchery.DEPENDENCIES, acceptedMinecraftVersions=Witchery.ACCEPTED_MC_VERSION, guiFactory=Witchery.GUIFACTORY)
public class Witchery {

	public static final String MOD_ID = "witchery";
	public static final String MODID_NBT = "Witchery";
	public static final String MOD_NAME = "Witchery1.12";
	public static final String VERSION = "@VERSION@";
	public static final String VERSION_ELDARIELLIB = "@VERSIONELDARIELLIB@";
	public static final String BUILD_NUM = "1";
	public static final String DEPENDENCIES = "required-after:eldariellib@[0.0.1,);";
	public static final String ACCEPTED_MC_VERSION = "[1.12,1.12.2]";
	public static final String GUIFACTORY = "net.eldariel.witchery.client.gui.config.GuiFactoryWitchery";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	public static Random random = new Random();
	public static LogHelper logHelper = new LogHelper(MOD_NAME, BUILD_NUM);
	
}
