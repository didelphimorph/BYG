package voronoiaoc.byg.common.world.feature.biomefeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import voronoiaoc.byg.core.byglists.BYGConfiguredFeatures;

public class BYGFeatures {
    public static void addAlliumFieldFlowers(Biome biome) {
        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ALLIUM_FLOWER);
    }

    public static void addAmaranthFieldFlowers(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
//                Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.AMARANTH_CONFIG).withChance(0.3F),
//                Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CYANAMARANTH_CONFIG).withChance(0.3F),
//                Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MAGENTAAMARANTH_CONFIG).withChance(0.3F),
//                Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ORANGEAMARANTH_CONFIG).withChance(0.3F)),
//                Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLEAMARANTH_CONFIG))).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(
//                new CountDecoratorConfig(200))));
    }

    public static void addGlowcane(Biome biome) {
//        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUE_GLOWCANE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(4))));
//        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RED_GLOWCANE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(4))));
//        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_GLOWCANE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(4))));
//        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_GLOWCANE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(4))));
//
    }
    public static void addFernGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.TAIGA_GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));

    }

    public static void addBYGDesertPlants(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PRICKLY_PEAR_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GOLDEN_SPINED_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FIRECRACKER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));

    }

    public static void addFirecracker(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FIRECRACKER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));

    }

    public static void addPrairieGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TALLPRAIRIEGRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(25))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PRAIRIEGRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(200))));
    }

    public static void addPumpkinPatch(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PUMPKIN_CONFIG).decorate(Decorator.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceDecoratorConfig(8))));

    }

    public static void addBlueberries(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUEBERRY_BUSH_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addLushBlueberries(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUEBERRY_BUSH_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(5))));
    }

    public static void addBeachGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BEACH_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_BEACH_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addLargeLake(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.RAW_GENERATION, BYGFeatureList.LAKE_WIDE_SHALLOW.configure(FeatureConfig.DEFAULT).decorate(AnyWaterOrSolidSurfaceSurface.WWATERORSOLIDSURFACE.configure(new CountDecoratorConfig(4))));
    }

    public static void addLargeLavaLake(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.RAW_GENERATION, BYGFeatureList.LAKE_LAVA_WIDE_SHALLOW.configure(FeatureConfig.DEFAULT).decorate(AnyWaterOrSolidSurfaceSurface.WWATERORSOLIDSURFACE.configure(new CountDecoratorConfig(3))));
    }

    public static void addVolcanicCarvers(Biome biome) {
//        biome.addCarver(GenerationStep.Carver.AIR, Biome.configureCarver(BYGFeatureList.VOLCANIC_CARVER, new ProbabilityConfig(0.02F)));

    }

    public static void addEmburBogVegetation(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.EMBURMUSHROOM.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(2, 0.5F, 3))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.EMBURMUSHROOM2.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(2, 0.5F, 3))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.EMBUR_ROOTS.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(15, 0.5F, 12))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.TALL_EMBUR_ROOTS.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(15, 0.5F, 12))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGFeatureList.EMBUR_GEL_VINES.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(20, 0.8F, 6))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.EMBUR_WART.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(3, 0.5F, 2))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.EMBUR_LILY.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(2, 0.5F, 2))));

    }

    public static void addAzalea(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.AZALEA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addDelphinium(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.DELPHINIUM_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addJapaneseOrchid(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.JAPANESEORCHID_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(3))));
    }

    public static void addWiltedGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WILTED_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addWeedGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WEED_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addWinterGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addLeafPile(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LEAF_PILE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addCloverFlowerPatch(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CLOVER_PATCH).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FLOWER_PATCH).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addCherryFoliage(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_CHERRY_FOLIAGE).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(3))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WHITE_CHERRY_FOLIAGE).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(3))));
    }

    public static void addBYGSwampVegetation(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TINY_LILYPAD_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WATER_SILK_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.LILY_PAD_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));

    }

    public static void addBYGLilyPad(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TINY_LILYPAD_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(0))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.LILY_PAD_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));

    }

    public static void addHorseweed(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.HORSEWEED_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addWinterSucculent(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_SUCCULENT_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addShortGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
    }

    public static void addIris(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.IRIS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addTulips(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GREEN_TULIP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MAGENTA_TULIP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CYAN_TULIP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_TULIP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.YELLOW_TULIP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));


    }

    public static void addCaliforniaPoppy(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CALIFORNIA_POPPY_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addCrocus(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CROCUS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addAlpineBellflower(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ALPINE_BELLFLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addWinterScilla(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_SCILLA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addYellowDaffodil(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.YELLOW_DAFFODIL_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addDaffodil(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.DAFFODIL_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addPinkDaffodil(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_DAFFODIL_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addLolliPop(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LOLLI_POP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addRose(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ROSE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addBlackRose(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLACK_ROSE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addOsiria(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.OSIRIA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addWinterRose(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_ROSE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addSnowdrops(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SNOWDROPS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addMudDisks(Biome biomeIn) {
//        biomeIn.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.DISK.configure(new DiskFeatureConfig(BYGBlockList.MUD_BLOCK.getDefaultState(), 4, 1, Lists.newArrayList(Blocks.DIRT.getDefaultState(), Blocks.GRASS_BLOCK.getDefaultState()))).decorate(Decorator.COUNT_TOP_SOLID.configure(new CountDecoratorConfig(1))));
    }

    public static void addBYGMushrooms(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WEEPING_MILKCAP_CONFIG).decorate(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(3, 0.125F))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLACK_PUFF_CONFIG).decorate(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(3, 0.125F))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WOOD_BLEWIT_CONFIG).decorate(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(3, 0.125F))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GREEN_MUSHROOM_CONFIG).decorate(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(3, 0.125F))));
    }

    public static void addGlowshrooms(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUE_GLOWSHROOM_CONFIG).decorate(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(3, 0.125F))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_GLOWSHROOM_CONFIG).decorate(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(3, 0.125F))));
    }

    public static void addAnemones(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_ANEMONE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WHITE_ANEMONE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addFoxgloves(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FOXGLOVE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addCattails(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CATTAIL_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(20))));

    }

    public static void addReeds(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.REEDS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(20))));

    }

    public static void addFairyslipper(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FAIRYSLIPPER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addCyanRose(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CYAN_ROSE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addRedorchid(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RED_ORCHID_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addPurpleOrchid(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_ORCHID_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addPinkOrchid(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_ORCHID_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addPeachleatherflower(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PEACH_LEATHER_FLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addVioletleatherflower(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.VIOLET_LEATHER_FLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addKovanFlower(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.KOVAN_FLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));
    }

    public static void addMarshGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.TALL_GRASS_CONFIG).decorate(Decorator.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseHeightmapDecoratorConfig(-0.8D, 5, 10))));

    }

    public static void addTallGrass(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TALL_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(10))));

    }


    public static void addSages(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WHITE_SAGE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_SAGE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addOrangeDaisy(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ORANGE_DAISY_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addPinkAllium(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_ALLIUM_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addRedCornflower(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RED_CORNFLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addBYGTropicFlowers(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BEGONIA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BISTORT_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GUZMANIA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.INCAN_LILY_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LAZARUS_BELLFLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TORCH_GINGER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RICHEA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addMiniCactus(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MINI_CACTUS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(2))));
    }

    public static void addQuagmireFeatures(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.QUAGMIREDEADBUSH_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(100))));
//        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGFeatureList.DEAD_TREE.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(1, 0.4F, -1))));

    }

    public static void addBYGBambooJungleVegetation(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.BAMBOO.configure(new ProbabilityConfig(0.1F)).decorate(Decorator.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidHeightmapNoiseBiasedDecoratorConfig(160, 80.0D, 0.3D, Heightmap.Type.WORLD_SURFACE_WG))));
    }

    public static void addRockyStoneBoulder(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.configure(new ForestRockFeatureConfig(BYGBlockList.ROCKY_STONE.getDefaultState(), 0)).decorate(Decorator.FOREST_ROCK.configure(new CountDecoratorConfig(2))));
    }

    public static void addTerracottaBoulder(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.configure(new ForestRockFeatureConfig(Blocks.ORANGE_TERRACOTTA.getDefaultState(), 0)).decorate(Decorator.FOREST_ROCK.configure(new CountDecoratorConfig(3))));
    }

    public static void addMossyStoneBoulder(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.configure(new ForestRockFeatureConfig(BYGBlockList.MOSSY_STONE.getDefaultState(), 0)).decorate(Decorator.FOREST_ROCK.configure(new CountDecoratorConfig(2))));
    }

    public static void addFrostMagmaLakes(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS, BYGFeatureList.LAKE_FROST.configure(new SingleStateFeatureConfig(BYGBlockList.FROST_MAGMA.getDefaultState())).decorate(Decorator.WATER_LAKE.configure(new ChanceDecoratorConfig(4))));

    }


//    public static void addNetherFortress(Biome biome) {
//        biome.addStructure(Feature.NETHER_BRIDGE.configure(FeatureConfig.DEFAULT));
//        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, Feature.NETHER_BRIDGE.configure(FeatureConfig.DEFAULT).decorate(Decorator.NOPE.configure(IDecoratorConfig.NO_Decorator_CONFIG)));
//    }

    public static void addWarpedVegetation(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WARPED_CACTUS_CONFIG).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(2, 0.4F, -1))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WARPED_BUSH.configure(FeatureConfig.DEFAULT).decorate(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(400, 0, 0, 256))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WARPED_CORAL.configure(FeatureConfig.DEFAULT).decorate(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(600, 0, 0, 256))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WARPED_CORALFAN.configure(FeatureConfig.DEFAULT).decorate(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(600, 0, 0, 256))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WARPED_CORALPLANT.configure(FeatureConfig.DEFAULT).decorate(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(300, 0, 0, 256))));
    }

    public static void addSythianVegetation(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.SYTHIAN_STALK.configure(new ProbabilityConfig(0.9F)).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.SYTHIAN_ROOTS.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.SYTHIAN_SPROUT.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
    }

    public static void addGlowstoneGardenVegetation(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WEED_GRASS.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WEEPING_MILKCAP.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WOOD_BLEWIT.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.BLACK_PUFF.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.GREEN_MUSHROOM.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(10, 0.5F, 8))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.NETHER_BRISTLE.configure(FeatureConfig.DEFAULT).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(2, 0.4F, 1))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WEEPING_ROOTS.configure(FeatureConfig.DEFAULT).decorate(Decorator.LIGHT_GEM_CHANCE.configure(new CountDecoratorConfig(150))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.WEEPING_ROOTS_PLANT.configure(FeatureConfig.DEFAULT).decorate(Decorator.LIGHT_GEM_CHANCE.configure(new CountDecoratorConfig(200))));

    }

//    public static void addEndCity(Biome biome) {
//        //biome.addFeature(GenerationStep.Feature.SURFACE_STRUCTURES, Feature.END_CITY.configure(FeatureConfig.DEFAULT).decorate(Decorator.NOPE.configure(IDecoratorConfig.NO_Decorator_CONFIG)));
//        biome.addStructure(Feature.END_CITY.configure(FeatureConfig.DEFAULT));
//        //biome.addFeature(GenerationStep.Feature.SURFACE_STRUCTURES, Feature.END_GATEWAY.configure(EndGatewayConfig.func_214702_a(EndDimension.SPAWN, true)).decorate(Decorator.END_GATEWAY.configure(IDecoratorConfig.NO_Decorator_CONFIG)));
//    }

    public static void addDeadSeaSpires(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.RAW_GENERATION, BYGFeatureList.TALLDEADSEASPIKES.configure(FeatureConfig.DEFAULT).decorate(AtOceanFloorWithExtra.OCEANFLOOR.configure(new CountExtraDecoratorConfig(2, 0.1F, 1))));
        //biome.addFeature(GenerationStep.Feature.RAW_GENERATION, BYGFeatureList.DEADSEASPIKES.configure(FeatureConfig.DEFAULT).decorate(AtOceanFloorWithExtra.OCEANFLOOR.configure(new CountExtraDecoratorConfig(25, 0.1F, 1))));
    }

//    public static void addSkyrisFortress(Biome biome) {
//        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, BYGFeatureList.SKYRISFORTRESS.configure(FeatureConfig.DEFAULT).decorate(Decorator.NOPE.configure(IDecoratorConfig.NO_Decorator_CONFIG)));
//        biome.addStructure(BYGFeatureList.SKYRISFORTRESS.configure(FeatureConfig.DEFAULT));
//    }

    public static void addHugeNetherMushrooms(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(Feature.HUGE_RED_MUSHROOM.configure(DefaultBiomeFeatures.HUGE_RED_MUSHROOM_CONFIG), Feature.HUGE_BROWN_MUSHROOM.configure(DefaultBiomeFeatures.HUGE_BROWN_MUSHROOM_CONFIG))).decorate(UnderGroundPlacement.UGPLACER.configure(new CountExtraDecoratorConfig(2, 0.5F, 2))));
        //biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
//                BYGFeatureList.BLUE_GLOWSHROOM_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.5F),
//                BYGFeatureList.PURPLE_GLOWSHROOM_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.5F),
//                BYGFeatureList.GREEN_MUSHROOM_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.5F),
//                BYGFeatureList.WOOD_BLEWIT_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.5F),
//                BYGFeatureList.WEEPING_MILKCAP_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.5F)),
//                BYGFeatureList.BLACK_PUFF_HUGE.configure(DecoratedFeatureConfig.DEFAULT))).decorate(UnderGroundPlacement.UGPLACER.configure(
//                new CountExtraDecoratorConfig(5, 0.5F, 2))));

    }

    public static void addTropFungalMushrooms(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
//                BYGFeatureList.GREEN_MUSHROOM_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.2F),
//                BYGFeatureList.WOOD_BLEWIT_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.4F),
//                BYGFeatureList.WEEPING_MILKCAP_HUGE.configure(DecoratedFeatureConfig.DEFAULT).withChance(0.4F)),
//                BYGFeatureList.BLACK_PUFF_HUGE.configure(DecoratedFeatureConfig.DEFAULT))).decorate(Decorator.COUNT_EXTRA.configure(
//                new CountExtraDecoratorConfig(15, 0.5F, 5))));
    }

    public static void addIvisPlants(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.IVIS_ROOTS).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.IVIS_SPROUT).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));
    }

    public static void addExtraCanyons(Biome biome) {
//        biome.addCarver(GenerationStep.Carver.AIR, Biome.configureCarver(Carver.CANYON, new ProbabilityConfig(0.8F)));
    }

    public static void addGiantFlowerFeatures(Biome biome) {
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGFeatureList.GIANT_ANGELICA_FLOWER.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(1, 0.3F, -1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGFeatureList.GIANT_DANDELION_FLOWER.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(1, 0.3F, -1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGFeatureList.GIANT_IRIS_FLOWER.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(1, 0.3F, -1))));
        //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, BYGFeatureList.GIANT_ROSE_FLOWER.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(1, 0.3F, -1))));
    }
}
