import unittest
import time
from selenium import webdriver
from ddt import ddt,data,unpack,file_data

@ddt
class Baidu(unittest.TestCase):
    def setUp(self) -> None:
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com/"
        self.driver.maximize_window()
        time.sleep(3)

    def tearDown(self) -> None:
        self.driver.quit()

    def 