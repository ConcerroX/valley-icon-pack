package concerrox.valley.activities

import android.os.Bundle
import candybar.lib.activities.CandyBarMainActivity
import concerrox.valley.licenses.License

class MainActivity : CandyBarMainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setCon
    }

    override fun onInit(): ActivityConfiguration {
        return ActivityConfiguration().setLicenseCheckerEnabled(License.isLicenseCheckerEnabled())
            .setLicenseKey(License.getLicenseKey()).setRandomString(License.getRandomString())
            .setDonationProductsId(License.getDonationProductsId()).setPremiumRequestProducts(
                License.getPremiumRequestProductsId(), License.getPremiumRequestProductsCount()
            )
    }
}