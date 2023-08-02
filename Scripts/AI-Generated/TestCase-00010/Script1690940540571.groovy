import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_docs_your-profile_deleting-your-profile'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/your-profile/deleting-your-profile')

'step 2: Add visual checkpoint at Page_docs_your-profile_deleting-your-profile'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00010_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
