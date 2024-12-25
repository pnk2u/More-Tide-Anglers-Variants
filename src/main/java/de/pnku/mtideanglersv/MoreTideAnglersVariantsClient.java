package de.pnku.mtideanglersv;

import de.pnku.mtideanglersv.client.renderer.MtavModelPredicates;
import net.fabricmc.api.ClientModInitializer;

import static de.pnku.mtideanglersv.MoreTideAnglersVariants.isMWeaponVLoaded;

public class MoreTideAnglersVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        if (isMWeaponVLoaded){
            MtavModelPredicates.registerMtavModelPredicates();
        }
    }
}
