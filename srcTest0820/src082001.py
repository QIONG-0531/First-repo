from selenium import webdriver
import time
import unittest

class Baidu2(unittest.TestCase):
    def setUp(self) -> None:
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com/"
        self.driver.maximize_window()
        time.sleep(3)

    def tearDown(self) -> None:
        self.driver.quit()

    def test_nihao(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_id("kw").send_keys("nihao")
        driver.find_element_by_id("su").click()
        time.sleep(3)

    if __name__ == '__main__':
        unittest.main()