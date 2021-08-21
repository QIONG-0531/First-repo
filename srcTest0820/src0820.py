from selenium import webdriver
import time
import unittest

class Baidu1(unittest.TestCase):
    def setUp(self) -> None:
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com/"
        self.driver.maximize_window()
        time.sleep(3)

    def tearDown(self) -> None:
        self.driver.quit()

    def test_hao(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_link_text("hao123").click()
        time.sleep(3)

    def test_hi(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_id("kw").send_keys("hi")
        driver.find_element_by_id("su").click()
        time.sleep(3)

    if __name__ == '__main__':
        unittest.main()

