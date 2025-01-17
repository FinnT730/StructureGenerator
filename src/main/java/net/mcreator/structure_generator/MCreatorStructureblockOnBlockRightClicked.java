package net.mcreator.structure_generator;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

public class MCreatorStructureblockOnBlockRightClicked extends structure_generator.ModElement {

	public MCreatorStructureblockOnBlockRightClicked(structure_generator instance) {
		super(instance);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorStructureblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorStructureblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorStructureblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorStructureblockOnBlockRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), MCreatorCornerpeace.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 16), (int) (y + 16), (int) (z + 16)), MCreatorCornerpeace.block.getDefaultState(), 3);
	}
}
