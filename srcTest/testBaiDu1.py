from selenium import webdriver
import time
import unittest

class Baidu1(unittest.TestCase):

    #   测试固件
    #    测试初始化工作
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = driver = "https://www.baidu.com/"
        self.driver.maximize_window()
        time.sleep(3)

    #     测试后的清理工作
    def tearDown(self):
        self.driver.quit()

    #    测试用例
    def test_hao(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_link_text("hao123").click()
        time.sleep(3)

# 忽略用例执行
    @unittest.skip("skipping")
    def test_bai(self):
        driver = self.driver
        url = self.url
        driver.get(url)
        driver.find_element_by_id("kw").send_keys("你好")
        time.sleep(2)
        driver.find_element_by_id("su").click()
        time.sleep(3)

if __name__ == "__main__":
        unittest.main(verbosity=0)

