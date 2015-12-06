package info.jbcs.minecraft.vending;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Random;

public class GeneralClient {
	public static Random rand = new Random();

	public static void playChiselSound(World world, int x, int y, int z, String sound) {
		Minecraft.getMinecraft().theWorld.playSound(x + 0.5, y + 0.5, z + 0.5, sound, 0.3f + 0.7f * rand.nextFloat(), 0.6f + 0.4f * rand.nextFloat(), true);
	}

	static HashMap<String,ResourceLocation> resources=new HashMap<String,ResourceLocation>();
	public static void bind(String textureName) {
		ResourceLocation res=resources.get(textureName);
		
		if(res==null){
			res=new ResourceLocation(textureName);
			resources.put(textureName,res);
		}
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(res);
	}
}
