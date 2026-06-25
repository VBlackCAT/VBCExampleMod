package net.v_blcak_cat.vbcexamplemod.item;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;


public class ExampleItem extends Item {

    public ExampleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (!level.isClientSide()) {
            level.playSound(null, pos, SoundEvents.UI_BUTTON_CLICK.value(), SoundSource.BLOCKS, 1.0F, 1.0F);
            level.gameEvent(GameEvent.ITEM_INTERACT_FINISH, pos, GameEvent.Context.of(player));
            stack.hurtAndBreak(1, player, context.getHand().asEquipmentSlot());
        }

        return InteractionResult.SUCCESS;
    }
}