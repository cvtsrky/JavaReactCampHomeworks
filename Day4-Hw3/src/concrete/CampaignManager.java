package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adli kampanya eklendi.");
		
	}
	
	@Override
	public void AddMultiple(Campaign[] campaigns) {
		for (Campaign campaign : campaigns) {
			System.out.println(campaign.getCampaignName() + " adli kampanya eklendi.");
		}
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adli kampanya güncellendi.");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya silindi.");
		
	}

}
