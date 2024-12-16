package de.pnku.mtideanglersv;

import de.pnku.mtideanglersv.client.renderer.MtavModelPredicates;
import net.fabricmc.api.ClientModInitializer;

public class MoreTideAnglersVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MtavModelPredicates.registerMtavModelPredicates();
    }
}
