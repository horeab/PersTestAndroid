package libgdx.implementations.skel;

import java.util.ArrayList;
import java.util.List;

import libgdx.campaign.CampaignGameDependencyManager;
import libgdx.campaign.LettersCampaignLevelEnum;
import libgdx.campaign.LettersQuestionCategoryEnum;
import libgdx.campaign.LettersQuestionDifficultyLevel;
import libgdx.campaign.StarsService;
import libgdx.resources.IncrementingRes;

public class SkelGameDependencyManager extends CampaignGameDependencyManager {

    @Override
    public List<? extends IncrementingRes> getIncrementResList() {
        List<IncrementingRes> list = new ArrayList<>();
        return list;
    }

    @Override
    protected String allQuestionText() {
        return "";
    }

    @Override
    public Class<SkelGameSpecificResource> getSpecificResourceTypeEnum() {
        return SkelGameSpecificResource.class;
    }

    @Override
    public Class<LettersCampaignLevelEnum> getCampaignLevelTypeEnum() {
        return LettersCampaignLevelEnum.class;
    }

    @Override
    public Class<LettersQuestionCategoryEnum> getQuestionCategoryTypeEnum() {
        return LettersQuestionCategoryEnum.class;
    }

    @Override
    public Class<LettersQuestionDifficultyLevel> getQuestionDifficultyTypeEnum() {
        return LettersQuestionDifficultyLevel.class;
    }


    @Override
    public String getExtraContentProductId() {
        return "extraContentPerstest";
    }

    public StarsService getStarsService() {
        return new StarsService();
    }
}
