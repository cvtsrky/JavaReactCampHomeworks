package abstracts;

import entities.Campaign;

public interface CampaignService {
		void Add(Campaign campaign);
		void AddMultiple(Campaign[] campaigns);
		void Update(Campaign campaign);
		void Delete(Campaign campaign);
}
