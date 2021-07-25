import unittest
from selenium import webdriver

from src0720.data import testBaiDu1, testBaiDu2


#    使用addTest()一个一个添加
def createsuite():
    suite = unittest.TestSuite()
    suite.addTest(testBaiDu1.Baidu1("test_hao"))
    suite.addTest(testBaiDu2.Baidu("test_hao"))
    return suite

# 只需要传入测试类的名称
# 使用makeSuite()  TestLoader()
def  createsuite1():
    suite=unittest.TestSuite()
    suite.addTest(unittest.makeSuite(testBaiDu1.Baidu1))
    suite.addTest(unittest.makeSuite(testBaiDu2.Baidu))
    return suite

# 使用TestLoader()
def createsuite2():
    suite1 = unittest.TestLoader().loadTestsFromTestCase(testBaiDu1.Baidu1)
    suite2 = unittest.TestLoader().loadTestsFromTestCase(testBaiDu2.Baidu)
    suite = unittest.TestSuite([suite1,suite2])
    return suite

# discover
def createsuite3():
    discover = unittest.defaultTestLoader.discover("../data",pattern="testBaiDu*.py",top_level_dir=None)
    print(discover)
    return discover

if __name__ =="__main__":
    suite =createsuite3()
    runner = unittest.TextTestRunner(verbosity=2)
    runner.run(suite)