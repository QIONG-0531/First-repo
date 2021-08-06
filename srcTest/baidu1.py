from selenium import webdriver
import time
import unittest

class baidu1(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com/"
        self.driver.maximize_window()
        time.sleep(3)

    def tearDown(self):
        self.driver.quit()

    def test_nihao(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_id("kw").send_keys("hello")
        driver.find_element_by_id("su").click()
        time.sleep(3)

    def test_jj(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_id("kw").send_keys("我爱你")
        driver.find_element_by_id("su").click()
        time.sleep(3)

    if __name__== "__main__" :
        unittest.main()


