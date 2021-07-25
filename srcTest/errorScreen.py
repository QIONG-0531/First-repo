from selenium import webdriver
import time,os
import unittest


class baidu(unittest.TestCase):
    def setUp(self):
        self.driver=webdriver.Chrome()
        self.url="https://www.baidu.com/"
        self.driver.maximize_window()
        time.sleep(2)

    def tearDown(self):
        self.driver.quit()

    def savescreenshot(self, driver, filename):
        if not os.path.exists('./image'):
            os.makedirs('./image')
        now = time.strftime("%Y-%m-%d-%H-%M-%S", time.localtime(time.time()))
        # 截图保存
        driver.get_screenshot_as_file('./image/'+now+'-'+filename)
        time.sleep(3)

    def test_baidu(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_id("kw").send_keys("生活")
        driver.find_element_by_id("su").click()
        time.sleep(2)
        print(driver.title)
        try:
            self.assertEqual(driver.title, "百度一下", msg="c错了")
        except:
            self.savescreenshot(driver, "hao.png")
        time.sleep(4)

    if __name__ == "__main__":
        unittest.main()

