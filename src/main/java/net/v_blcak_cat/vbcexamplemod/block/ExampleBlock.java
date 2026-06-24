package net.v_blcak_cat.vbcexamplemod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ExampleBlock extends Block {
    public ExampleBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {

        super.onPlace(state, level, pos, oldState, movedByPiston);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal(
                    String.format("[useWithoutItem] 玩家: %s | 位置: %s | 方块: %s",
                            player.getName(),
                            pos.toShortString(),
                            state.getBlock().getName().getString())
            ));
        }
        return super.useWithoutItem(state, level, pos, player, hitResult);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide()){
            player.sendSystemMessage(Component.literal(
                    String.format("[useItemOn] 玩家: %s | 手持: %s (%s) | 主副手: %s | 位置: %s | 方块: %s",
                            player.getName(),
                            itemStack.getHoverName().getString(),
                            itemStack.typeHolder().unwrapKey().map(Object::toString).orElse("未知"),
                            hand == InteractionHand.MAIN_HAND ? "主手" : "副手",
                            pos.toShortString(),
                            state.getBlock().getName().getString())
            ));
        }

        return super.useItemOn(itemStack, state, level, pos, player, hand, hitResult);
    }
}
