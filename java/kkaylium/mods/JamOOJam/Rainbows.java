package kkaylium.mods.JamOOJam;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import kkaylium.mods.JamOOJam.proxy.CommonProxy;

import java.util.logging.Logger;

/**
 * Created by Kayla Marie on 12/18/2014.
 */
@Mod(name = "Rainbows", modid = "rainbows", version = "0.0.1a")
public class Rainbows {

    public static final Logger logger = Logger.getLogger("rainbows");

    @Mod.Instance("rainbows")
    public static Rainbows instance;

    @SidedProxy(clientSide = "kkaylium.mods.JamOOJam.proxy.ClientProxy", serverSide = "kkaylium.mods.JamOOJam.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
