package pl.coderslab.charity.donation;

public interface DonationService {
    void save(Donation donation);
    int countDonations();
    int countDonationBags();

}
