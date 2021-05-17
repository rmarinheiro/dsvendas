import BarChart from "componentes/barcharts";
import DataTable from "componentes/dataTable";
import DonutChart from "componentes/donutChart";
import Footer from "componentes/footer";
import Navbar from "componentes/navbar";

const DashBoard = () => {
    return (
        <>
        <Navbar />
        <div className="container">
          <h1 className="text-primary py-3">Demo desenvolvida para integrar Spring/React </h1>
          <div className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center secondary">Taxa de Sucesso</h5>
              <BarChart />
  
            </div>
            <div className="col-sm-6">
              <h5 className="text-center secondary">Taxa de Sucesso</h5>
              <DonutChart />
  
            </div>
  
          </div>
          <div className="py-3">
            <h2 className="text-primary">Todas as Vendas</h2>
          </div>
          <DataTable />
        </div>
        <Footer />
      </>
    )
}

export default DashBoard;