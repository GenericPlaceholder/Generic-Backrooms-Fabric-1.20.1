package net.generic404_.genericbackrooms.block.lighting;

import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class Fluorescent extends Block {
    public static final BooleanProperty ACTIVE = BooleanProperty.of("active");

    public Fluorescent(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(ACTIVE, true));
    }

    public static int getLuminance(BlockState currentBlockState){
        boolean active = currentBlockState.get(Fluorescent.ACTIVE);
        return(active ? 15 : 0);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
    }
}
