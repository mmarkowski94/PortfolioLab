package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    @Override
    public int countDonations() {
        return donationRepository.findAll().size();
    }

    @Override
    public int countDonationBags() {
        int countDonationBags = 0;
        List<Donation> donationsList = donationRepository.findAll();
        for (Donation donation : donationsList) {
            countDonationBags += donation.getQuantity();
        }
        return countDonationBags;
    }
}
