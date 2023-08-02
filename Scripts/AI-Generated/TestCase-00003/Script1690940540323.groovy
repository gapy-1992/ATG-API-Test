import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_docs_squads_creating-your-squad'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/squads/creating-your-squad')

'step 2: At Page_docs_squads_creating-your-squad click on hyperlink_daily_dev_privacy'

testObj = findTestObject('Object Repository/Page_docs_squads_creating-your-squad/hyperlink_daily_dev_privacy')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/docs/squads/creating-your-squad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_docs_squads_creating-your-squad click on hyperlink_www_meetup_com_the_monthly_dev_world_cla'

testObj = findTestObject('Object Repository/Page_docs_squads_creating-your-squad/hyperlink_www_meetup_com_the_monthly_dev_world_cla')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/docs/squads/creating-your-squad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_docs_squads_creating-your-squad click on hyperlink_faqs --> navigate to Page_faqs'

testObj = findTestObject('Object Repository/Page_docs_squads_creating-your-squad/hyperlink_faqs')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/docs/squads/creating-your-squad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_faqs'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
