package libgdx.game;

import libgdx.controls.labelimage.InventoryTableBuilderCreator;
import libgdx.controls.popup.RatingService;
import libgdx.resources.Res;
import libgdx.resources.ResourceService;
import libgdx.screen.AbstractScreen;
import libgdx.screen.AbstractScreenManager;
import libgdx.transactions.TransactionsService;

public abstract class MainDependencyManager<
        TScreenManager extends AbstractScreenManager,
        TScreen extends AbstractScreen,
        TRes extends Enum & Res,
        TGameId extends Enum & GameId> {

    public abstract Class<TRes> getMainResourcesClass();

    public abstract Class<TGameId> getGameIdClass();

    public abstract ResourceService createResourceService();

    public abstract RatingService createRatingService(TScreen abstractScreen);

    public abstract TransactionsService getTransactionsService();

    public abstract InventoryTableBuilderCreator createInventoryTableBuilderCreator();

    public abstract TScreenManager createScreenManager();
}
