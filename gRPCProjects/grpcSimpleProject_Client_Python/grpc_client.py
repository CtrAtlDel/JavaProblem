import grpc

import greating_service_pb2
import greating_service_pb2_grpc

def run():
    with grpc.insecure_channel('localhost:8080') as chanel: # with  используется для открытия канала к серверу
        stub = greating_service_pb2_grpc.SimpleServiceStub(chanel)

        response = stub.greeting(greating_service_pb2.Request(name='Ivan go to sleep'))
        print("Greating from server: " + response.greeting)

run()