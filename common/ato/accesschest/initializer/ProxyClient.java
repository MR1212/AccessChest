package ato.accesschest.initializer;

import ato.accesschest.game.BlockAtoChest;
import ato.accesschest.game.TileEntityAtoChest;
import ato.accesschest.game.TileEntityAtoChestRenderer;
import ato.accesschest.handler.KeybindHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * 初期化処理
 * クライアントサイドのみ実行される
 */
public class ProxyClient extends ProxyCommon {

    @Override
    public void init() {
        super.init();
        registerRenderer();
        registerKeybindings();
    }

    /**
     * レンダラの登録
     */
    private void registerRenderer() {
        TileEntityAtoChestRenderer renderer = new TileEntityAtoChestRenderer();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAtoChest.class, renderer);
        BlockAtoChest.RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(BlockAtoChest.RENDER_ID, renderer);
    }

    /**
     * 特殊キーの登録
     */
    private void registerKeybindings() {
        KeyBindingRegistry.registerKeyBinding(new KeybindHandler());
    }
}
