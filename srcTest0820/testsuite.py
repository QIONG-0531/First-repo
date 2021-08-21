# import unittest
# from srcTest0820 import src0820,src082001
#
# def createsuite1():
#     suite = unittest.TestSuite()
#     suite.addTest(src0820.Baidu1("test_hao"))
#     suite.addTest(src0820.Baidu1("test_hi"))
#     suite.addTest(src082001.Baidu2("test_nihao"))
#     return suite
#
# def createsuite2():
#     suite = unittest.TestSuite()
#     suite.addTest(unittest.makeSuite(src0820.Baidu1))
#     suite.addTest(unittest.makeSuite(src082001.Baidu2))
#     return suite
#
# def createsuite3():
#     suite1 = unittest.TestLoader().loadTestsFromTestCase(src0820.Baidu1)
#     suite2 = unittest.TestLoader().loadTestsFromTestCase(src082001.Baidu)
#     suite = unittest.TestSuite([suite1,suite2])
#     return suite
#
#
#
#  if __name__ == '__main__':
#         suite = createsuite1()
#         runner = unittest.TextTestRunner(verbosity=2)
#         runner.run(suite)
